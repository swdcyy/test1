package com.tachikoma.component.imageview.model.TKIcon;
import java.io.Serializable;
import java.lang.Object;

public class TKIcon implements Serializable	// class@000d05
{
    public String dark;
    public String darkUrl;
    public String file;
    public String normal;
    public String normalUrl;
    public String resultTintColor;
    public int resultType;
    public String resultUri;

    public void TKIcon(){
       super();
       this.resultType = -2;
    }
}
