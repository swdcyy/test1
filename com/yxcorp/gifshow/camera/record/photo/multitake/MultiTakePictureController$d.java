package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$d;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.String;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a;
import w0c.r;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.lang.Boolean;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class MultiTakePictureController$d	// class@000ecf
{
    public final MagicEmoji$MagicFace a;
    public final String b;
    public final BeautifyConfig c;
    public final a d;
    public final r e;
    public final FilterConfig f;
    public Boolean g;
    public final String h;

    public void MultiTakePictureController$d(MagicEmoji$MagicFace p0,String p1,BeautifyConfig p2,a p3,r p4,FilterConfig p5,Boolean p6,String p7){
       a.p(p4, "bodyData");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
    }
    public final BeautifyConfig a(){
       return this.c;
    }
    public final r b(){
       return this.e;
    }
    public final MagicEmoji$MagicFace c(){
       return this.a;
    }
    public final Boolean d(){
       return this.g;
    }
}
