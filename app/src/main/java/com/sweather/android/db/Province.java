package com.sweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by think on 2017/3/5.
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProcinceName(){
        return provinceName;
    }
    public  void setProcinceName(String provinceName){
        this.provinceName=provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }
}
