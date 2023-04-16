package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$h;
import android.view.View$OnClickListener;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rp4.a;
import q87.c;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel;
import rp4.b;
import com.yxcorp.gifshow.widget.FakePieLoadingView;
import java.util.Objects;
import androidx.lifecycle.LiveData;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.List;
import java.util.Collection;
import com.kuaishou.post.story.entrance.data.MoodTemplateUiData;
import kotlin.Pair;
import com.kuaishou.post.story.entrance.e;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import nq4.c;
import java.lang.Integer;
import di0.b;
import java.lang.StringBuilder;
import mq4.f;

public final class MoodTemplateViewBinder$h implements View$OnClickListener	// class@000b60
{
    public final MoodTemplateViewBinder b;

    public void MoodTemplateViewBinder$h(MoodTemplateViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       int i1;
       MoodTemplateUiData moodTemplate;
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateViewBinder$h.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MoodTemplateViewBinder", "mRemoteTemplateContainer openRemoteTemplatePanel", objArray);
       String str = (this.b.S.z0())? "EDIT_MOOD_PHOTO": "PRODUCE_MOOD_PHOTO";
       b.g("MOOD_CHANGE_BACKGROUND", str, "");
       if (this.b.s.a()) {
          objArray = new Object[i];
          a.D().w("MoodTemplateViewBinder", "mRemoteTemplateContainer loading", objArray);
       }else {
          MoodTemplateViewBinder s = this.b.S;
          Objects.requireNonNull(s);
          Object[] objArray2 = null;
          if (!PatchProxy.applyVoid(objArray2, s, MoodTemplateViewModel.class, "4")) {
             Object[] objArray3 = new Object[i];
             a.D().w("MoodTemplateViewModel", "openRemoteTemplatePanel", objArray3);
             ListHolder value = s.c.getValue();
             if (value != null) {
                List list = value.c();
                if (list != null) {
                   i1 = list.isEmpty() ^ true;
                   moodTemplate = (i1)? list.get(i): objArray2;
                }else {
                label_0088 :
                   moodTemplate = objArray2;
                   i1 = 0;
                }
             }else {
                goto label_0088 ;
             }
             if (i1) {
                Pair value1 = s.a.getValue();
                if (value1 != null) {
                   objArray2 = value1.getFirst();
                }
                if (objArray2 == null && (s.b.getValue() == null && s.n.l == null)) {
                   a.m(moodTemplate);
                   s.a.setValue(new Pair(moodTemplate, Boolean.FALSE));
                }
             label_00bb :
                s.f.setValue(Boolean.TRUE);
             }else {
                ArrayList uArrayList = new ArrayList();
                uArrayList.add(c.a);
                s.c.s(uArrayList, Integer.valueOf(3));
             }
             objArray2 = new Object[i];
             a.D().w("MoodTemplateViewModel", "openRemoteTemplatePanel fetched:"+i1+", "+"firstRemoteTemplate:"+moodTemplate, objArray2);
          }
          if (this.b.s.a()) {
             s.F = true;
          }
       }
       Object[] objArray1 = new Object[i];
       a.D().w("MoodTemplateViewBinder", "mRemoteTemplateContainer openRemoteTemplatePanel mSelectPosition:"+this.b.D.X0(), objArray1);
       return;
    }
}
