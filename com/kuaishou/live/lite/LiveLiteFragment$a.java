package com.kuaishou.live.lite.LiveLiteFragment$a;
import com.kuaishou.live.lite.LiveLiteFragment;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import gq3.a;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.Lifecycle$State;
import brd.t;
import wa1.e;
import v63.m;
import erd.g;
import crd.b;
import androidx.lifecycle.Lifecycle;
import v63.l;
import androidx.lifecycle.LifecycleObserver;

public class LiveLiteFragment$a	// class@001d63
{
    public final a a;
    public final b b;
    public final LiveLiteFragment c;

    public void LiveLiteFragment$a(LiveLiteFragment p0,LifecycleOwner p1){
       this.c = p0;
       super();
       a uoa = new a();
       this.a = uoa;
       uoa.getLifecycle().setCurrentState(Lifecycle$State.RESUMED);
       this.b = e.a().subscribe(new m(this, p1));
       p1.getLifecycle().addObserver(new l(this));
    }
}
