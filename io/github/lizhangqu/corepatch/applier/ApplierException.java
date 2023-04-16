package io.github.lizhangqu.corepatch.applier.ApplierException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;

public class ApplierException extends Exception	// class@001034
{

    public void ApplierException(String p0){
       super(p0);
    }
    public void ApplierException(String p0,Throwable p1){
       super(p0, p1);
    }
    public void ApplierException(Throwable p0){
       super(p0);
    }
}
