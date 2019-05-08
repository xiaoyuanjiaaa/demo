package com.fc.datastatistics.bean;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

public class Test {
    @ApiModelProperty(value="nihao")
    @NotNull(message = "不能为空")
    private String validname;

    public void setValidname(String validname) {
        this.validname = validname;
    }

    public String getValidname() {
        return validname;
    }
}
