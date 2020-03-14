package top.lcmatrix.util.codegenerator.plugin.sample;

import top.lcmatrix.util.codegenerator.common.plugin.IOutputModel;

import java.util.Date;

public class OutputModel implements IOutputModel {

    private Object data1;
    private Object data2;

    private Date createTime;

    public Object getData1() {
        return data1;
    }

    public void setData1(Object data1) {
        this.data1 = data1;
    }

    public Object getData2() {
        return data2;
    }

    public void setData2(Object data2) {
        this.data2 = data2;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
