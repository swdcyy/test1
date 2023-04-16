package com.kuaishou.android.model.mix.SummaryViewModel;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.String;
import java.util.List;

public class SummaryViewModel implements Serializable	// class@000e08
{
    public CDNUrl[] mIcon;
    public String mKsOrderId;
    public String mText;
    public String mTextColor;
    public int mType;
    public List mUsers;
    public static final long serialVersionUID = 0x6f4832abed220459;

    public void SummaryViewModel(){
       super();
       this.mUsers = new ArrayList();
    }
    public CDNUrl[] getIcon(){
       return this.mIcon;
    }
    public String getText(){
       return this.mText;
    }
    public List getUsers(){
       return this.mUsers;
    }
}
