package com.yxcorp.gifshow.music.widget.search.a;
import y8c.g;
import ty5.b;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.music.widget.search.a$a;
import ml8.c;

public class a extends g	// class@0020b0
{
    public MusicSearchUiOption A;
    public boolean w;
    public String x;
    public String y;
    public b z;

    public void a(boolean p0,b p1){
       super();
       this.w = p0;
       this.z = p1;
    }
    public f h1(ViewGroup p0,int p1){
       a obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.A;
       int i = 0;
       a$a uoa1 = (obj != null && obj.isDarkMode())? 1: null;
       if (uoa1) {
          i = 2;
       }
       return new f(a.j(p0, 0x7f0d095b, i), new a$a(this));
    }
    public void r1(String p0){
       this.x = p0;
    }
    public void s1(String p0){
       this.y = p0;
    }
}
