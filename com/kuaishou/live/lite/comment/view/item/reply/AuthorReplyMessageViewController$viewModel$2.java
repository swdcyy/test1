package com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController$viewModel$2$1;
import com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController$viewModel$2$a;

public final class AuthorReplyMessageViewController$viewModel$2 extends Lambda implements a	// class@000840
{
    public final LiveData $commentMessageLiveData;
    public final ItemViewControllerFactory$a $dependence;
    public final AuthorReplyMessageViewController this$0;

    public void AuthorReplyMessageViewController$viewModel$2(AuthorReplyMessageViewController p0,LiveData p1,ItemViewControllerFactory$a p2){
       this.this$0 = p0;
       this.$commentMessageLiveData = p1;
       this.$dependence = p2;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, AuthorReplyMessageViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AuthorReplyMessageViewController$viewModel$2$a(new AuthorReplyMessageViewController$viewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
