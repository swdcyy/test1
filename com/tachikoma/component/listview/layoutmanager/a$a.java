package com.tachikoma.component.listview.layoutmanager.a$a;
import androidx.recyclerview.widget.o;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class a$a extends o	// class@000d12
{
    public int q;
    public boolean r;
    public int s;

    public void a$a(Context p0){
       super(p0);
    }
    public int B(){
       int i = (this.r != null)? 0x2710: -1;
       return i;
    }
    public int s(int p0,int p1,int p2,int p3,int p4){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p4 == 0x2710) {
          return (((p2 + ((p3 - p2) / 2)) - (p0 + ((p1 - p0) / 2))) + this.q);
       }else {
          return (super.s(p0, p1, p2, p3, p4) + this.q);
       }
    }
    public int w(int p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       uoa = this.s;
       if (uoa > null) {
          return uoa;
       }else {
          return super.w(p0);
       }
    }
    public int z(){
       int i = (this.r != null)? 0x2710: -1;
       return i;
    }
}
