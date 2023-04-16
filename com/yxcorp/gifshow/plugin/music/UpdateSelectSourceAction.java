package com.yxcorp.gifshow.plugin.music.UpdateSelectSourceAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.plugin.music.SelectSource;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class UpdateSelectSourceAction extends EditSdkAction	// class@000ff1
{
    public final SelectSource selectSource;

    public void UpdateSelectSourceAction(SelectSource p0){
       a.p(p0, "selectSource");
       super();
       this.selectSource = p0;
    }
    public final SelectSource getSelectSource(){
       return this.selectSource;
    }
}
