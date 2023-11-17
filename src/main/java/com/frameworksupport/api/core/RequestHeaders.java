package com.frameworksupport.api.core;

import java.util.HashMap;
import java.util.Map;
import com.frameworksupport.util.general.CommonUtil;

public class RequestHeaders {
  protected CommonUtil commonUtil = ApiBaseTest.getCommonUtil();
  
  private Map<String, String> requestHeaderMap = new HashMap<>();
  
  public void addRequestHeader(String key, String value) {
    this.commonUtil.log("Adding Header: " + key + " : " + value);
    this.requestHeaderMap.put(key, value);
  }
  
  public void removeRequestHeader(String key) {
    this.commonUtil.log("Removing key from Header: " + key);
    this.requestHeaderMap.remove(key);
  }
  
  public Map<String, String> getRequestHeaders() {
    return this.requestHeaderMap;
  }
}
