package com.kwai.feature.post.api.feature.publish.model.PublishBackDialogStyleParam;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import lnc.a1;
import com.kwai.feature.post.api.feature.publish.model.PublishBackDialogStyleParam$a;

public class PublishBackDialogStyleParam implements Serializable	// class@0013c0
{
    public String mFirstBtnTxt;
    public String mSecondBtnTxt;
    public int mSelectedIndex;
    public String mThirdBtnTxt;
    public String mTitle;

    public void PublishBackDialogStyleParam(){
       super();
       this.mTitle = a1.p(0x7f10519e);
       this.mFirstBtnTxt = a1.p(0x7f1042cf);
       this.mSecondBtnTxt = a1.p(0x7f104051);
       this.mThirdBtnTxt = a1.p(0x7f1004b4);
       this.mSelectedIndex = 0;
    }
    public void PublishBackDialogStyleParam(PublishBackDialogStyleParam$a p0){
       super();
    }
}
