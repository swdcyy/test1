package com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController$viewModel$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController$viewModel$2;
import ba3.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xp5.i;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import td3.o;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;

public final class SimpleCommentMessageViewController$viewModel$2$1 extends Lambda implements a	// class@000825
{
    public final SimpleCommentMessageViewController$viewModel$2 this$0;

    public void SimpleCommentMessageViewController$viewModel$2$1(SimpleCommentMessageViewController$viewModel$2 p0){
       this.this$0 = p0;
       super(0);
    }
    public final i invoke(){
       Object obj = PatchProxy.apply(null, this, SimpleCommentMessageViewController$viewModel$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SimpleCommentMessageViewController$viewModel$2$1 tthis$0 = this.this$0;
       return new i(tthis$0.this$0, tthis$0.$commentMessageLiveData, tthis$0.$dependence.e(), this.this$0.$dependence.h());
    }
    public Object invoke(){
       return this.invoke();
    }
}
