package com.kuaishou.webkit.adapter.FileChooserParamsAdapter;
import com.kuaishou.webkit.WebChromeClient$FileChooserParams;
import android.webkit.WebChromeClient$FileChooserParams;
import android.content.Intent;
import java.lang.String;
import java.lang.CharSequence;

public class FileChooserParamsAdapter extends WebChromeClient$FileChooserParams	// class@0012a6
{
    public WebChromeClient$FileChooserParams mStub;

    public void FileChooserParamsAdapter(WebChromeClient$FileChooserParams p0){
       super();
       this.mStub = p0;
    }
    public Intent createIntent(){
       return this.mStub.createIntent();
    }
    public String[] getAcceptTypes(){
       return this.mStub.getAcceptTypes();
    }
    public String getFilenameHint(){
       return this.mStub.getFilenameHint();
    }
    public int getMode(){
       return this.mStub.getMode();
    }
    public CharSequence getTitle(){
       return this.mStub.getTitle();
    }
    public boolean isCaptureEnabled(){
       return this.mStub.isCaptureEnabled();
    }
}
