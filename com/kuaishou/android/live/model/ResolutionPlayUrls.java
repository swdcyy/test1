package com.kuaishou.android.live.model.ResolutionPlayUrls;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class ResolutionPlayUrls implements Serializable	// class@000832
{
    public boolean mDefaultSelect;
    public int mLevel;
    public String mName;
    public String mShortName;
    public String mType;
    public List mUrls;
    public static final long serialVersionUID = 0xd76a5fd2015e6993;

    public void ResolutionPlayUrls(){
       super();
       this.mUrls = new ArrayList();
    }
}
