package com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController$viewModel$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController$viewModel$2;
import da3.h;
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

public final class AuthorReplyMessageViewController$viewModel$2$1 extends Lambda implements a	// class@00083e
{
    public final AuthorReplyMessageViewController$viewModel$2 this$0;

    public void AuthorReplyMessageViewController$viewModel$2$1(AuthorReplyMessageViewController$viewModel$2 p0){
       this.this$0 = p0;
       super(0);
    }
    public final h invoke(){
       Object obj = PatchProxy.apply(null, this, AuthorReplyMessageViewController$viewModel$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AuthorReplyMessageViewController$viewModel$2$1 tthis$0 = this.this$0;
       return new h(tthis$0.this$0, tthis$0.$commentMessageLiveData, tthis$0.$dependence.e(), this.this$0.$dependence.h());
    }
    public Object invoke(){
       return this.invoke();
    }
}
