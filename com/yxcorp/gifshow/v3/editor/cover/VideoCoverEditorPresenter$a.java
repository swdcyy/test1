package com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter$a;
import com.yxcorp.gifshow.v3.widget.PictureSelectView$e;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public class VideoCoverEditorPresenter$a implements PictureSelectView$e	// class@000e2c
{
    public final VideoCoverEditorPresenter a;

    public void VideoCoverEditorPresenter$a(VideoCoverEditorPresenter p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       VideoCoverEditorPresenter$a uoa = VideoCoverEditorPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.a.K.onNext(Boolean.TRUE);
       return;
    }
}
