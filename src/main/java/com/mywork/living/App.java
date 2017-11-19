package com.mywork.living;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(getAppVersion("3.4.7.1"));
    }
    
	public static int getAppVersion(String appVersion) {
		// TODO Auto-generated method stub
		int version = 0;
		if(appVersion==null){
			appVersion= "3.4.3";
		}
		if(appVersion.length()>5){
			 version = Integer.parseInt(appVersion.substring(0, 5).replace(".", ""));
		}else{
			 version = Integer.parseInt(appVersion.replace(".", ""));
		}
		return version;
	}
}
