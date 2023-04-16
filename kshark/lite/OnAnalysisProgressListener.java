package kshark.lite.OnAnalysisProgressListener;
import kshark.lite.OnAnalysisProgressListener$a;
import kshark.lite.OnAnalysisProgressListener$Step;

public interface abstract OnAnalysisProgressListener	// class@001bb5
{
    public static final OnAnalysisProgressListener$a a;

    static {
       OnAnalysisProgressListener.a = OnAnalysisProgressListener$a.b;
    }
    void a(OnAnalysisProgressListener$Step p0);
}
