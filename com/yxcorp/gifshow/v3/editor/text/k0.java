package com.yxcorp.gifshow.v3.editor.text.k0;
import jw8.r$a;
import com.yxcorp.gifshow.v3.editor.text.n0;
import java.lang.Object;
import android.view.View;
import ypc.a;
import java.util.Objects;
import huc.h0;
import java.lang.Runnable;
import t45.c;
import rwc.j;
import com.yxcorp.gifshow.v3.widget.PictureSelectView$e;
import aw9.z;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.widget.adv.model.f;
import com.yxcorp.gifshow.widget.adv.ITimelineView$d;
import java.lang.Math;
import voc.o;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.v3.editor.text.model.TextConfigParam;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import ooc.g1;

public final class k0 implements r$a	// class@00145d
{
    public final n0 a;

    public void k0(n0 p0){
       this.a = p0;
    }
    public final void a(View p0,a p1,int p2){
       double d;
       k0 ta = this.a;
       Objects.requireNonNull(ta);
       c.a(new h0(ta, p1));
       if (ta.C.getValue() != null) {
          ta.C.getValue().a((int)ta.v.g());
       }
       if (ta.z.getSelectDrawer() == null) {
          if (f.E(ta.r.a1())) {
             d = ta.v.g();
          }else {
             ITimelineView$d obj = PatchProxy.apply(null, ta, n0.class, "14");
             if (obj != PatchProxyResult.class) {
                d = obj.doubleValue();
             }else {
                d = ta.v.g();
                double d1 = ta.v.q();
                obj = ta.x.i.o;
                double d2 = (obj)? (double)obj: 0x3fb999999999999a;
                d = Math.min(d, (d1 - d2));
                if (ta.r.a1() != Workspace$Type.PHOTO_MOVIE) {
                   if (f.s(ta.u.x().f())) {
                      d = ta.v.g();
                   }
                   d = f.j(d, ta.u.x().f(), 2.00f, 1);
                }
             }
          }
          TimeRange$b uob = TimeRange.newBuilder();
          uob.b(d);
          uob.a(ta.R8(d));
          TimeRange timeRange = uob.build();
          ta.N.r0(p1.p(), timeRange, ta.v.d(), ta.v.c());
       }else {
          ta.N.i1(ta.z.getSelectDrawer().getEditTextBaseElementData(), p1.p(), ta.v.d(), 0, ta.v.c());
       }
       g1.c(ta.s, ta.t, p1.b());
       return;
    }
}
