package com.kuaishou.webkit.internal.annotation.UnsupportedAppUsage;
import java.lang.annotation.Annotation;
import java.lang.String;

public interface abstract UnsupportedAppUsage implements Annotation	// class@001329
{

    String expectedSignature();
    String implicitMember();
    int maxTargetSdk();
    String overrideSourcePosition();
    String publicAlternatives();
    long trackingBug();
}
