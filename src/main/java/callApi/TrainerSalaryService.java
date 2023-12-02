package callApi;

import com.easy.learn.consts.ApiPath;
import com.easy.learn.dto.TrainerSalaryPaid.TrainerSalaryPaid;
import com.easy.learn.dto.TrainerSalaryPaid.TrainerSalaryPaidDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainerSalaryService {
    @Value("${api.host.url}")
    String apiHostUrl;

    @Autowired
    RestTemplate restTemplate;


    public List<TrainerSalaryPaid> getAllTrainerSalaryPaid() {
        String url = apiHostUrl + ApiPath.TRAINER_SALARY_GET_ALL;
        org.springframework.http.HttpHeaders headers = new HttpHeaders();


        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<TrainerSalaryPaidDTO> responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, new ParameterizedTypeReference<TrainerSalaryPaidDTO>() {});

        TrainerSalaryPaidDTO trainerSalaryPaidDTO = responseEntity.getBody();

        return  trainerSalaryPaidDTO.getList();
    }
}