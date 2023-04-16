package com.kwai.feature.component.photofeatures.reward.fragment.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.feature.component.photofeatures.reward.fragment.l;
import com.kwai.feature.component.photofeatures.reward.fragment.RewardPhotoPanelDialogFragment$a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class c extends Accessor	// class@00122e
{
    public final RewardPhotoPanelDialogFragment$a c;
    public final l d;

    public void c(l p0,RewardPhotoPanelDialogFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.j;
    }
    public void set(Object p0){
       this.c.j = p0;
    }
}
