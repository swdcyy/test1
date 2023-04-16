package com.yxcorp.gifshow.v3.editor.text.subtitle.c0;
import a17.b$b;
import com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleTextPresenter;
import java.lang.Object;
import a17.c;
import android.view.View;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.text.subtitle.z;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import androidx.lifecycle.LiveData;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import tuc.c;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import java.lang.Integer;
import java.lang.Number;

public final class c0 implements b$b	// class@001495
{
    public final SubtitleTextPresenter a;

    public void c0(SubtitleTextPresenter p0){
       this.a = p0;
    }
    public final void a(c p0,View p1,int p2){
       c0 ta = this.a;
       Objects.requireNonNull(ta);
       if (!p2) {
          ta.J.R();
          SubtitleTextPresenter o = ta.O;
          z b = z.b;
          Objects.requireNonNull(o);
          if (!PatchProxy.applyVoidOneRefs(b, o, TextElementViewModel.class, "38")) {
             a.p(b, "predicate");
             ArrayList uArrayList = new ArrayList();
             ListHolder value = o.w.getValue();
             if (value != null) {
                List list = value.c();
                if (list != null) {
                   Iterator iterator = list.iterator();
                   while (iterator.hasNext()) {
                      c uoc = iterator.next();
                      if (b.test(uoc.a())) {
                         uArrayList.add(Integer.valueOf(uoc.a().l0()));
                      }
                   }
                }
             }
             Iterator iterator1 = uArrayList.iterator();
             while (iterator1.hasNext()) {
                o.v0(iterator1.next().intValue(), 8);
             }
          }
          ta.V8();
       }
       return;
    }
}
