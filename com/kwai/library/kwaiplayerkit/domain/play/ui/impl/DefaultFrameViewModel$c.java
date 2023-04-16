package com.kwai.library.kwaiplayerkit.domain.play.ui.impl.DefaultFrameViewModel$c;
import ux6.e;
import java.lang.Object;
import mrd.a;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class DefaultFrameViewModel$c implements e	// class@000861
{
    public a a;
    public a b;
    public a c;
    public a d;

    public void DefaultFrameViewModel$c(){
       super();
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<PlayerForUiInterface>\(\)");
       this.a = uoa;
       uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<WeakReference<Bitmap>>\(\)");
       this.b = uoa;
       uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<FrameLayout.LayoutParams>\(\)");
       this.c = uoa;
       uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<Int>\(\)");
       this.d = uoa;
    }
    public final a a(){
       return this.b;
    }
    public final a b(){
       return this.c;
    }
    public final a c(){
       return this.a;
    }
    public final a d(){
       return this.d;
    }
}
