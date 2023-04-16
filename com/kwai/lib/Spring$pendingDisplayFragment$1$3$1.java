package com.kwai.lib.Spring$pendingDisplayFragment$1$3$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import com.kwai.lib.BaseSpringDialogFragment;
import java.lang.String;
import java.lang.Class;
import msd.l;
import java.lang.Object;
import qrd.l1;
import com.kwai.lib.Spring;

public final class Spring$pendingDisplayFragment$1$3$1 extends Lambda implements a	// class@000811
{
    public final Class $activityClass;
    public final l $callback;
    public final Context $context;
    public final BaseSpringDialogFragment $fragment;
    public final String $tag;

    public void Spring$pendingDisplayFragment$1$3$1(Context p0,BaseSpringDialogFragment p1,String p2,Class p3,l p4){
       this.$context = p0;
       this.$fragment = p1;
       this.$tag = p2;
       this.$activityClass = p3;
       this.$callback = p4;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Spring.c(this.$context, this.$fragment, this.$tag, this.$activityClass, this.$callback);
    }
}
