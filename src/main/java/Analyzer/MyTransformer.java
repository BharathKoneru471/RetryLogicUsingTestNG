package Analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransformer implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		//we need to provide where the retry logic is present (in RetryAnlayzer(dummy) class) using the annotation
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
		
	}
	

}
