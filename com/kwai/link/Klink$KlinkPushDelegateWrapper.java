package com.kwai.link.Klink$KlinkPushDelegateWrapper;
import java.util.concurrent.atomic.AtomicInteger;
import com.kwai.link.IKlinkPushDelegate;
import java.lang.Object;
import com.kwai.link.Transaction;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class Klink$KlinkPushDelegateWrapper	// class@000ada
{
    public final IKlinkPushDelegate mDelegate;
    public final int mID;
    public static final AtomicInteger UNIQUE_ID;

    static {
       Klink$KlinkPushDelegateWrapper.UNIQUE_ID = new AtomicInteger(0);
    }
    public void Klink$KlinkPushDelegateWrapper(IKlinkPushDelegate p0){
       super();
       this.mID = Klink$KlinkPushDelegateWrapper.UNIQUE_ID.incrementAndGet();
       this.mDelegate = p0;
    }
    public void OnPush(Transaction p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Klink$KlinkPushDelegateWrapper.class, "1")) {
          return;
       }
       this.mDelegate.OnPush(p0);
       return;
    }
    public int getID(){
       return this.mID;
    }
}
