package org.openmrs.module.pihmalawi.reporting.definition;

import org.junit.Before;
import org.junit.Test;
import org.openmrs.module.pihmalawi.reports.Helper;
import org.openmrs.module.pihmalawi.reports.setup.SetupPihQuarterlyCrossSite;
import org.openmrs.test.BaseModuleContextSensitiveTest;
import org.springframework.test.annotation.Rollback;

public class PihQuarterlyCrossSitePersistentSetup extends BaseModuleContextSensitiveTest {
	
	@Override
	public Boolean useInMemoryDatabase() {
		return false;
	}
	
	@Before
	public void setup() throws Exception {
		authenticate();
	}
	
	@Test
	@Rollback(false)
	public void setupReport() throws Exception {
		new SetupPihQuarterlyCrossSite(new Helper()).setup();
	}
}