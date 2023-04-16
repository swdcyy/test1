package com.kwai.component.photo.detail.slide.cocreate.utils.CoCreateSelectUserServerData;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class CoCreateSelectUserServerData implements Serializable	// class@000a4c
{
    public int role;
    public String userid;
    public static final long serialVersionUID = 0x3cdd18860b44fa25;

    public void CoCreateSelectUserServerData(String p0,int p1){
       super();
       this.userid = p0;
       this.role = p1;
    }
}
