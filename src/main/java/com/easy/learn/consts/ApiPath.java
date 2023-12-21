package com.easy.learn.consts;

public interface ApiPath {
    String API = "/api/v1";

    //ping
    String PING = API + "/ping";

    //user
    String USER_SIGN_IN = API + "/sign-in";
    String USER_GET_ALL = API + "/user/get-all";
    String USER_GET_UUID = API + "/user/get-by-uuid";
    String USER_CREATE = API + "/user/create";
    String USER_UPDATE = API + "/user/update";
    String USER_DELETE = API + "/user/delete";
    //trainersalarypaid
    String TRAINER_SALARY_GET_ALL = API + "/trainersalary/get-all";
    // manager
    String MANAGER_SIGN_IN = API + "/manager/sign-in";
    String MANAGER_GET_ALL = API + "/manager/get-all";
    String MANAGER_GET_UUID = API + "/manager/get-uuid";
    String MANAGER_CREATE = API + "/manager/create";
    String MANAGER_UPDATE = API + "/manager/update";
    String MANAGER_DELETE = API + "/manager/delete";

    // end

    String ADMIN_GET_INDEX = API+"/admin";


}
