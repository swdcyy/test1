package com.yxcorp.gifshow.comment.log.CommentStayTimeLogPresenter$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.comment.log.CommentStayTimeLogPresenter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

public class CommentStayTimeLogPresenter$a extends RecyclerView$r	// class@0010df
{
    public final CommentStayTimeLogPresenter a;

    public void CommentStayTimeLogPresenter$a(CommentStayTimeLogPresenter p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       CommentStayTimeLogPresenter$a uoa = CommentStayTimeLogPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (!p1) {
          CommentStayTimeLogPresenter$a ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, CommentStayTimeLogPresenter.class, "4")) {
             if (ta.P8()) {
                ta.S8();
             }else if(ta.r > 0){
                ta.R8();
             }
          }
       }
       return;
    }
}
