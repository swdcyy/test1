package com.yxcorp.gifshow.activity.share.presenter.m2$k;
import ra9.c;
import com.yxcorp.gifshow.activity.share.presenter.m2;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.e7;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ra9.b;
import java.lang.CharSequence;
import android.text.TextUtils;

public class m2$k implements c	// class@00140d
{
    public final int b;
    public String c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final m2 j;

    public void m2$k(m2 p0,int p1,int p2,String p3,String p4,int p5,boolean p6){
       this.j = p0;
       super();
       this.b = p1;
       this.f = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.g = p6;
       this.h = true;
       this.i = true;
       if (PatchProxy.applyVoid(null, this, m2$k.class, "1")) {
       }else if(!p6){
          e7.b(this.getBubbleKey(), this.getBubbleShowTimes());
       }
       return;
    }
    public boolean couldShow(){
       Object obj = PatchProxy.apply(null, this, m2$k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (b.a(this) && this.g != null)? true: false;
       return b;
    }
    public String getBubbleKey(){
       Object obj = PatchProxy.apply(null, this, m2$k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(this.d)) {
          return b.b(this);
       }
       return this.d;
    }
    public int getBubbleShowTimes(){
       return this.e;
    }
    public String getContent(){
       return this.c;
    }
    public String getFunctionName(){
       return b.e(this);
    }
    public int getMode(){
       return b.f(this);
    }
    public int getPriority(){
       return 0;
    }
    public int getType(){
       return this.b;
    }
    public boolean isAutoDismissWhenPageStop(){
       return b.h(this);
    }
    public boolean isBlockedAfterShowingSelf(){
       return this.h;
    }
    public boolean isBlockedByOthersBeforeShowing(){
       return this.i;
    }
    public String name(){
       return "SHARE_COVER_CROP_BUBBLE_NAME";
    }
    public int upgradeVersion(){
       return this.f;
    }
}
