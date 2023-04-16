package com.kuaishou.merchant.marketing.shop.ginsengfruit.model.DialogConfigV1;
import com.kuaishou.merchant.marketing.shop.ginsengfruit.model.BaseDialogConfig;
import com.kuaishou.merchant.marketing.shop.ginsengfruit.model.DialogConfigV1$a;
import nsd.u;
import java.util.List;
import java.lang.String;

public final class DialogConfigV1 extends BaseDialogConfig	// class@001be1
{
    public List animImageUrl;
    public List imageUrl;
    public String subTitle;
    public static final DialogConfigV1$a Companion;
    public static final long serialVersionUID;

    static {
       DialogConfigV1.Companion = new DialogConfigV1$a(null);
    }
    public void DialogConfigV1(){
       super();
    }
    public final List getAnimImageUrl(){
       return this.animImageUrl;
    }
    public final List getImageUrl(){
       return this.imageUrl;
    }
    public final String getSubTitle(){
       return this.subTitle;
    }
    public final void setAnimImageUrl(List p0){
       this.animImageUrl = p0;
    }
    public final void setImageUrl(List p0){
       this.imageUrl = p0;
    }
    public final void setSubTitle(String p0){
       this.subTitle = p0;
    }
}
