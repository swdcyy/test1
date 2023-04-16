package com.kwai.component.list.exposed.behavior.ItemExposedBehavior;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.component.list.exposed.behavior.ItemExposedBehavior$Event;

public class ItemExposedBehavior	// class@0009a9
{
    public final PublishSubject a;

    public void ItemExposedBehavior(){
       super();
       this.a = PublishSubject.g();
    }
    public void e(boolean p0){
       ItemExposedBehavior itemExposedB = ItemExposedBehavior.class;
       if (PatchProxy.isSupport(itemExposedB) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, itemExposedB, "5")) {
          return;
       }
       itemExposedB = this.a;
       ItemExposedBehavior$Event cOLLECT_RESE = (p0)? ItemExposedBehavior$Event.COLLECT_RESET_INDEX_RECORD: ItemExposedBehavior$Event.COLLECT;
       itemExposedB.onNext(cOLLECT_RESE);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, ItemExposedBehavior.class, "6")) {
          return;
       }
       this.a.onNext(ItemExposedBehavior$Event.REPORT);
       return;
    }
}
