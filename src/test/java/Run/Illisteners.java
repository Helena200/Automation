package Run;

import org.testng.ITestResult;

public class Illisteners {

	
		
		 public void onTestSuccess(ITestResult result) {
			  // TODO Auto-generated method stub
			  //ITestListener.super.onTestSuccess(result);
			  System.out.println("Automation is passed");
			  this.driver = ((Usability)result.getInstance()).driver;
			  Date dt=new Date();
			  System.out.println(dt);
			  String si=dt.toString().replace(" ", "_").replace(":", "_");
			  System.out.println(si);
			  File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   try {
			   FileHandler.copy(shots,new File("C:\\Users\\user\\Coding\\Trainingsession\\Pictures\\"+si+".png"));
			  } catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
			  

public void onTestFailure(ITestResult result) {
  // TODO Auto-generated method stub
  //ITestListener.super.onTestFailure(result);
  this.driver = ((Usability)result.getInstance()).driver;
  Date dt=new Date();
  System.out.println(dt);
  String si=dt.toString().replace(" ", "_").replace(":", "_");
  System.out.println(si);
  File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   try {
   FileHandler.copy(shots,new File("C:\\Users\\user\\Coding\\Trainingsession\\Pictures\\"+si+".png"));
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }




4627PA_Moawa Ali (to All - Entire Audience):

7:08 PM: hi



salim sehar (to All - Entire Audience):

7:08 PM: public void onTestFailure(ITestResult result) {
 
// TODO Auto-generated method stub
 
//ITestListener.super.onTestFailure(result);
 
this.driver = ((Usability)result.getInstance()).driver;
 
Date dt=new Date();
 
System.out.println(dt);
 
String si=dt.toString().replace(" ", "_").replace(":", "_");
 
System.out.println(si);
 
File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 
try {
 
FileHandler.copy(shots,new File("C:\\Users\\user\\Coding\\Trainingsession\\Pictures\\"+si+".png"));
 
} catch (IOException e) {
 
// TODO Auto-generated catch block
 
e.printStackTrace();
 
}
 
}
  
	}

}
