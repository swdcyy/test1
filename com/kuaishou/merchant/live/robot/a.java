package com.kuaishou.merchant.live.robot.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import i74.c;
import com.kuaishou.merchant.live.robot.LiveAudienceCartEffectPresenter;
import java.lang.Object;
import com.kuaishou.merchant.live.robot.LiveAudienceCartEffectPresenter$c;

public class a extends Accessor	// class@001ace
{
    public final LiveAudienceCartEffectPresenter c;
    public final c d;

    public void a(c p0,LiveAudienceCartEffectPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.w;
    }
    public void set(Object p0){
       this.c.w = p0;
    }
}
