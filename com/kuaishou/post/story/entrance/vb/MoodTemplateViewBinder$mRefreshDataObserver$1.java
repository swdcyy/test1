package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$mRefreshDataObserver$1;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel;
import di0.b;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo;
import androidx.lifecycle.LiveData;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.List;
import rp4.a;
import q87.c;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import com.kuaishou.post.story.entrance.data.MoodTemplateUiData;
import java.lang.Integer;

public final class MoodTemplateViewBinder$mRefreshDataObserver$1 implements LifecycleObserver	// class@000b67
{
    public final MoodTemplateViewBinder b;

    public void MoodTemplateViewBinder$mRefreshDataObserver$1(MoodTemplateViewBinder p0){
       this.b = p0;
       super();
    }
    public final void refreshDataIfNeed(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MoodTemplateViewBinder$mRefreshDataObserver$1.class, "1")) {
          return;
       }
       MoodTemplateViewBinder s = this.b.S;
       Objects.requireNonNull(s);
       if (!PatchProxy.applyVoid(objArray, s, MoodTemplateViewModel.class, "20") && s.c.v() <= 0) {
          ListHolder value = s.m.m().getValue();
          if (value != null) {
             List list = value.c();
             if (list != null) {
                Object[] objArray1 = new Object[0];
                a.D().w("MoodTemplateViewModel", "refreshDataIfNeedWhenResume: moodTemplateList is empty , refresh", objArray1);
                MoodTemplateViewModel c = s.c;
                ArrayList uArrayList = new ArrayList(u.Y(list, 10));
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   uArrayList.add(new MoodTemplateUiData(iterator.next()));
                }
                c.s(uArrayList, Integer.valueOf(4));
             }
          }
       }
       return;
    }
}
