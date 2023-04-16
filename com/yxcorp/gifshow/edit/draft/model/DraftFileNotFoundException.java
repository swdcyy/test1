package com.yxcorp.gifshow.edit.draft.model.DraftFileNotFoundException;
import com.yxcorp.gifshow.edit.draft.model.DraftLoadException;
import java.lang.String;
import java.lang.Throwable;

public class DraftFileNotFoundException extends DraftLoadException	// class@001aee
{

    public void DraftFileNotFoundException(String p0){
       super(p0);
    }
    public void DraftFileNotFoundException(String p0,Throwable p1){
       super(p0, p1);
    }
}
