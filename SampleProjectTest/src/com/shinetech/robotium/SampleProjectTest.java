package com.shinetech.robotium;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;
import android.widget.Button;
import android.widget.TextView;

import com.jayway.android.robotium.solo.Solo;

public class SampleProjectTest extends ActivityInstrumentationTestCase2<Main> {
	private Solo solo;

	public SampleProjectTest() {
		super(Main.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	@Smoke
	public void testExample01() {
		//clicking on a view by id
		final TextView example01TextView = (TextView) getActivity().findViewById(R.id.example_01_text_view);
		assertEquals("before click", example01TextView.getText().toString());
		final Button example01Button = (Button)getActivity().findViewById(R.id.example_01_button);
		solo.clickOnView(example01Button);
		assertEquals("after click", example01TextView.getText().toString());
	}
	
	@Smoke
	public void testExample02() {
		//clicking a view by searching for the text
		
	}

}
