package com.kwai.stentor.AsrProduct.AsrListener;
import xt7.a;
import com.kwai.stentor.commo.LogListener;
import vt7.i;
import com.kwai.stentor.AsrProduct.AsrListener$ASRResultCode;
import com.kwai.stentor.AsrProduct.AsrListener$ASRStatus;
import java.lang.String;

public interface abstract AsrListener implements a, LogListener	// class@001900
{

    void d(i p0,AsrListener$ASRResultCode p1,AsrListener$ASRStatus p2,long p3,String p4);
}
