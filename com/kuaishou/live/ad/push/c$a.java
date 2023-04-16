package com.kuaishou.live.ad.push.c$a;
import ks5.b;
import com.kuaishou.live.ad.push.c;
import java.lang.Object;
import ks5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.ad.fanstop.widget.FansTopNoticeBubbleView;
import android.view.ViewGroup;
import android.view.View;
import ks5.e;
import ks5.d;

public class c$a implements b	// class@0009eb
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void D(){
       a.d(this);
    }
    public void a(int p0){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.a.s.a(p0);
       return;
    }
    public View b(ViewGroup p0){
       return this.a.s;
    }
    public boolean c(){
       return d.a(this);
    }
    public void d(ViewGroup p0){
       d.b(this, p0);
    }
    public void e(ViewGroup p0){
       d.c(this, p0);
    }
    public int getBizId(){
       return 16;
    }
    public boolean i(){
       return true;
    }
    public String k(){
       return a.a(this);
    }
    public void onShow(){
       a.e(this);
    }
    public int[] p(){
       return a.b(this);
    }
}
