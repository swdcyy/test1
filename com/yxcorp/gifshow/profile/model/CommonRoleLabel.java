package com.yxcorp.gifshow.profile.model.CommonRoleLabel;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class CommonRoleLabel implements Serializable	// class@001387
{
    public int mLabelGroup;
    public List mRoleLabelList;
    public static final long serialVersionUID = 0x5eb12a52b7ae0047;

    public void CommonRoleLabel(){
       super();
       this.mRoleLabelList = new ArrayList();
    }
}
