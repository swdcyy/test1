package com.kwai.performance.stability.crash.monitor.message.NativeExceptionMessage;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import java.lang.String;

public final class NativeExceptionMessage extends ExceptionMessage	// class@000e3a
{
    public String mAbortMsg;
    public String mBackupBacktrace;
    public String mCause;
    public String mCode;
    public String mFaultAddr;
    public String mFingerprint;
    public String mGwpAsanAllocationBacktrace;
    public String mGwpAsanAllocationThread;
    public String mGwpAsanCause;
    public String mGwpAsanDeallocationBacktrace;
    public String mGwpAsanDeallocationThread;
    public String mManuallyKill;
    public boolean mNeedSwapBacktrace;
    public String mRegister;
    public String mRevision;
    public String mScudoAbortMsg;
    public String mSignal;
    public static final long serialVersionUID = 0x59d058e8eb3d45d7;

    public void NativeExceptionMessage(){
       super();
       this.mFingerprint = "Unknown";
       this.mRevision = "Unknown";
       this.mRegister = "Unknown";
       this.mSignal = "Unknown";
       this.mCode = "Unknown";
       this.mManuallyKill = "Unknown";
       this.mFaultAddr = "Unknown";
       this.mAbortMsg = "";
       this.mCause = "";
       this.mScudoAbortMsg = "";
       this.mGwpAsanCause = "";
       this.mGwpAsanAllocationThread = "";
       this.mGwpAsanAllocationBacktrace = "";
       this.mGwpAsanDeallocationThread = "";
       this.mGwpAsanDeallocationBacktrace = "";
       this.mNeedSwapBacktrace = false;
       this.mBackupBacktrace = "";
    }
    public String getTypePrefix(){
       return "NATIVE_";
    }
}
