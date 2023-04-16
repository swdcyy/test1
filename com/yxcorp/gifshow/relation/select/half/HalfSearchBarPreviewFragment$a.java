package com.yxcorp.gifshow.relation.select.half.HalfSearchBarPreviewFragment$a;
import y8c.g;
import com.yxcorp.gifshow.relation.select.half.HalfSearchBarPreviewFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import com.yxcorp.gifshow.model.ContactTargetItem;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.relation.select.half.HalfSearchBarPreviewFragment$a$a;
import ml8.c;

public class HalfSearchBarPreviewFragment$a extends g	// class@001997
{
    public final HalfSearchBarPreviewFragment w;

    public void HalfSearchBarPreviewFragment$a(HalfSearchBarPreviewFragment p0){
       this.w = p0;
       super();
    }
    public int f0(int p0){
       HalfSearchBarPreviewFragment$a uoa = HalfSearchBarPreviewFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       ContactTargetItem uContactTarg = this.N0(p0);
       if (uContactTarg != null) {
          return uContactTarg.mType;
       }else {
          return 0;
       }
    }
    public f h1(ViewGroup p0,int p1){
       HalfSearchBarPreviewFragment$a uoa = HalfSearchBarPreviewFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d05af), new HalfSearchBarPreviewFragment$a$a(this));
    }
}
