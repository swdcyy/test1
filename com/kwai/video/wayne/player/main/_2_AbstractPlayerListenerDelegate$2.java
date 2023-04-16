package com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate$2;
import com.kwai.video.player.IKwaiRepresentationListener;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class _2_AbstractPlayerListenerDelegate$2 implements IKwaiRepresentationListener	// class@000da8
{
    public final _2_AbstractPlayerListenerDelegate this$0;

    public void _2_AbstractPlayerListenerDelegate$2(_2_AbstractPlayerListenerDelegate p0){
       this.this$0 = p0;
       super();
    }
    public void onRepresentationSelected(int p0,boolean p1){
       _2_AbstractPlayerListenerDelegate$2 u2 = _2_AbstractPlayerListenerDelegate$2.class;
       if (PatchProxy.isSupport(u2) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, u2, "2")) {
          return;
       }
       _2_AbstractPlayerListenerDelegate mTmpRepresen = this.this$0.mTmpRepresentationListener;
       if (mTmpRepresen != null) {
          mTmpRepresen.onRepresentationSelected(p0, p1);
       }
       return;
    }
    public int onSelectRepresentation(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, _2_AbstractPlayerListenerDelegate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.this$0.mTmpRepresentationListener.onSelectRepresentation(p0);
    }
    public void representationChangeEnd(int p0,boolean p1){
       _2_AbstractPlayerListenerDelegate$2 u2 = _2_AbstractPlayerListenerDelegate$2.class;
       if (PatchProxy.isSupport(u2) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, u2, "4")) {
          return;
       }
       _2_AbstractPlayerListenerDelegate mTmpRepresen = this.this$0.mTmpRepresentationListener;
       if (mTmpRepresen != null) {
          mTmpRepresen.representationChangeEnd(p0, p1);
       }
       return;
    }
    public void representationChangeStart(int p0,int p1){
       _2_AbstractPlayerListenerDelegate$2 u2 = _2_AbstractPlayerListenerDelegate$2.class;
       if (PatchProxy.isSupport(u2) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, u2, "3")) {
          return;
       }
       _2_AbstractPlayerListenerDelegate mTmpRepresen = this.this$0.mTmpRepresentationListener;
       if (mTmpRepresen != null) {
          mTmpRepresen.representationChangeStart(p0, p1);
       }
       return;
    }
}
