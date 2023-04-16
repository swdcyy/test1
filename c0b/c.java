package c0b.c;
import com.hpplay.sdk.source.api.ILelinkPlayerListener;
import com.yxcorp.gifshow.lelink.screencast.KwaiLelink;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;

public final class c implements ILelinkPlayerListener	// class@00048f
{
    public final KwaiLelink a;

    public void c(KwaiLelink p0){
       this.a = p0;
       super();
    }
    public void onCompletion(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       Iterator iterator = this.a.d().iterator();
       while (iterator.hasNext()) {
          iterator.next().onCompletion();
       }
       return;
    }
    public void onError(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "9")) {
          return;
       }
       Iterator iterator = this.a.d().iterator();
       while (iterator.hasNext()) {
          iterator.next().onError(p0, p1);
       }
       return;
    }
    public void onInfo(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "6")) {
          return;
       }
       Iterator iterator = this.a.d().iterator();
       while (iterator.hasNext()) {
          iterator.next().onInfo(p0, p1);
       }
       return;
    }
    public void onLoading(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       Iterator iterator = this.a.d().iterator();
       while (iterator.hasNext()) {
          iterator.next().onLoading();
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       Iterator iterator = this.a.d().iterator();
       while (iterator.hasNext()) {
          iterator.next().onPause();
       }
       return;
    }
    public void onPositionUpdate(long p0,long p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uoc, "8")) {
          return;
       }
       Iterator iterator = this.a.d().iterator();
       while (iterator.hasNext()) {
          iterator.next().onPositionUpdate(p0, p1);
       }
       return;
    }
    public void onSeekComplete(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "5")) {
          return;
       }
       Iterator iterator = this.a.d().iterator();
       while (iterator.hasNext()) {
          iterator.next().onSeekComplete(p0);
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, c.class, "10")) {
          return;
       }
       Iterator iterator = this.a.d().iterator();
       while (iterator.hasNext()) {
          iterator.next().onStart();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       Iterator iterator = this.a.d().iterator();
       while (iterator.hasNext()) {
          iterator.next().onStop();
       }
       return;
    }
    public void onVolumeChanged(float p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "7")) {
          return;
       }
       Iterator iterator = this.a.d().iterator();
       while (iterator.hasNext()) {
          iterator.next().onVolumeChanged(p0);
       }
       return;
    }
}
