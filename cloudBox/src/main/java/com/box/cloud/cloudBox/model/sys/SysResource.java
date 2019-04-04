package com.box.cloud.cloudBox.model.sys;

public class SysResource {
    /**
     * 
     */
    private Long id;

    /**
     * 资源id
     */
    private Long resourceId;

    /**
     * url
     */
    private String url;

    /**
     * 备注
     */
    private String remark;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 资源对应的方法名称
     */
    private String methodName;

    /**
     * 资源对应的包路径
     */
    private String methodPath;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 资源id
     * @return resource_id 资源id
     */
    public Long getResourceId() {
        return resourceId;
    }

    /**
     * 资源id
     * @param resourceId 资源id
     */
    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * url
     * @return url url
     */
    public String getUrl() {
        return url;
    }

    /**
     * url
     * @param url url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 资源名称
     * @return resource_name 资源名称
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * 资源名称
     * @param resourceName 资源名称
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    /**
     * 资源对应的方法名称
     * @return method_name 资源对应的方法名称
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * 资源对应的方法名称
     * @param methodName 资源对应的方法名称
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    /**
     * 资源对应的包路径
     * @return method_path 资源对应的包路径
     */
    public String getMethodPath() {
        return methodPath;
    }

    /**
     * 资源对应的包路径
     * @param methodPath 资源对应的包路径
     */
    public void setMethodPath(String methodPath) {
        this.methodPath = methodPath == null ? null : methodPath.trim();
    }
}