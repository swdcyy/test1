package com.yxcorp.gifshow.HomeUiMode;
import java.lang.Enum;
import com.yxcorp.gifshow.HomeUiMode$1;
import java.lang.String;
import com.yxcorp.gifshow.HomeUiMode$2;
import com.yxcorp.gifshow.HomeUiMode$3;
import com.yxcorp.gifshow.HomeUiMode$4;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalArgumentException;
import android.app.Activity;
import lnc.b5;
import ekd.i;
import android.view.Window;
import uv8.m1;
import zf6.l;
import androidx.fragment.app.FragmentActivity;
import kn5.c;

public abstract class HomeUiMode extends Enum	// class@0012f4
{
    public final int mId;
    public static final HomeUiMode[] $VALUES;
    public static final HomeUiMode CHILD_HOME;
    public static final HomeUiMode NASA_HOME;
    public static final HomeUiMode NEBULA_HOME;
    public static final HomeUiMode VISITOR_HOME;

    static {
       HomeUiMode$1 u1 = new HomeUiMode$1("NEBULA_HOME", 0, 2);
       HomeUiMode.NEBULA_HOME = u1;
       HomeUiMode$2 u2 = new HomeUiMode$2("NASA_HOME", 1, 3);
       HomeUiMode.NASA_HOME = u2;
       HomeUiMode$3 u3 = new HomeUiMode$3("CHILD_HOME", 2, 4);
       HomeUiMode.CHILD_HOME = u3;
       HomeUiMode$4 u4 = new HomeUiMode$4("VISITOR_HOME", 3, 5);
       HomeUiMode.VISITOR_HOME = u4;
       HomeUiMode[] homeUiModeAr = new HomeUiMode[]{u1,u2,u3,u4};
       HomeUiMode.$VALUES = homeUiModeAr;
    }
    public void HomeUiMode(String p0,int p1,int p2){
       super(p0, p1);
       this.mId = p2;
    }
    public void HomeUiMode(String p0,int p1,int p2,HomeUiMode$1 p3){
       super(p0, p1, p2);
    }
    public static HomeUiMode fromId(int p0){
       HomeUiMode[] obj;
       object oobject;
       HomeUiMode homeUiMode = HomeUiMode.class;
       if (PatchProxy.isSupport(homeUiMode)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, homeUiMode, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = HomeUiMode.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             throw new IllegalArgumentException("illegal id");
          }
          oobject = obj[i];
          if (oobject.mId == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static void handelImmersiveMode(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, HomeUiMode.class, "4")) {
          return;
       }
       if (b5.a(p0) && !i.c()) {
          p0.getWindow().clearFlags(1024);
       }else if(!m1.g()){
          i.h(p0, 0, l.r());
       }
       return;
    }
    public static HomeUiMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HomeUiMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(HomeUiMode.class, p0);
    }
    public static HomeUiMode[] values(){
       Object obj = PatchProxy.apply(null, null, HomeUiMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HomeUiMode.$VALUES.clone();
    }
    public abstract void applyTheme(Activity p0);
    public abstract c createHomeFragment(FragmentActivity p0);
}
