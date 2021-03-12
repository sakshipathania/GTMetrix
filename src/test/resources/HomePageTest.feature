@loadatest 
Feature: Load Test On gtmetrix 
@loadatestoncanda_country 
Scenario: 
	Given Navigate to the website url. 
	Then  Click on the Login button. 
	Then Enter user email address "test147@gmail.com". 
	Then Insert the user Password "Qwerty". 
	Then Click on Login. 
      Scenario Outline: 
	   Then Fills the Analyze Performance of app "<URL>". 
	   Then click on Analyze cta. 
	   Then Get fully loaded Time,location and title URL. 
	   Then After Analyze the app see result for Vancouver, Canada. 
	   Then write time on location in excelsheet. 
	     	
		
            @loadatestonSanAntonio(USA) 
              Scenario Outline: 
	           Given Navigate to the website url. 
	           Then Fills the Analyze Performance of app "<URL>". 
	           Then Select the USA country. 
	           Then click on Analyze cta. 
	           Then Get fully loaded Time,location and title URL. 
	           Then After Analyze the app see result for San Antonio, USA. 
	           Then write location in excelsheet. 
	           
			  @loadatestonLondon(UK) 
			         Scenario Outline: 
					  Given Navigate to the website url. 
					  Then Fills the Analyze Performance of app "<URL>". 
					  Then Select London country. 
					  Then click on Analyze cta. 
					  Then Get fully loaded Time,location and title URL. 
					  Then After Analyze the app see result for London, UK. 
					  Then London location and time loaded in excelsheet. 
					   
			    @loadatestonMumbai(India) 
                             Scenario Outline: 
	                           Given Navigate to the website url. 
	                           Then Fills the Analyze Performance of app "<URL>". 
	                           Then Select India country. 
	                           Then click on Analyze cta. 
	                           Then Get fully loaded Time,location and title URL. 
	                           Then After Analyze the app see result for Mumbai, India. 
	                           Then India location and time loaded in excelsheet. 
	
@samplePageload 
Scenario Outline: 
	Given Navigate to the website url. 
	Then Fills the Analyze Performance of app "<URL>". 
	Then click on Analyze cta. 
	Then Get fully loaded Time,location and title URL. 
	Then After Analyze the smaple free app see result for Vancouver, Canada. 
	Then Sample page location and loaded time for Canada country. 
			
		
	          Scenario Outline: 
		       Given Navigate to the website url. 
		       Then Fills the Analyze Performance of app "<URL>". 
		       Then Select the USA country. 
		       Then click on Analyze cta. 
		       Then Get fully loaded Time,location and title URL. 
		       Then After Analyze the smaple free app see result for San Anotonio, USA. 
		       Then Sample page location and loaded time for USA country. 
		           		
	                   
 				Scenario Outline: 
		                   Given Navigate to the website url. 
		                   Then Fills the Analyze Performance of app "<URL>". 
		                   Then Select India country. 
		                   Then click on Analyze cta. 
		                   Then Get fully loaded Time,location and title URL. 
		                   Then After Analyze the smaple free app see result for Mumbai, India. 
		                   Then Sample page location and loaded time for India country. 		              
			                
																			
#share-and-download-products load test
@samplePageload 
              Scenario Outline: 
	           Given Navigate to the website url. 
	           Then Fills the Analyze Performance of app "<URL>". 
	           Then click on Analyze cta. 
	           Then Get fully loaded Time,location and title URL. 
	           Then After Analyze the share and download app see result for Vancouver, Canada. 
	           Then Share and download page location and loaded time for Canada country. 
	             	
		
	                Scenario Outline: 
	               	  Given Navigate to the website url. 
		              Then Fills the Analyze Performance of app "<URL>". 
		              Then Select the USA country. 
		              Then click on Analyze cta. 
		              Then Get fully loaded Time,location and title URL. 
		              Then After Analyze the share and download app see result for San Anotonio, USA. 
		              Then Share and download page location and loaded time for USA country. 
		                 
					
				         Scenario Outline: 					
				          Given Navigate to the website url. 
				          Then Fills the Analyze Performance of app "<URL>". 
					      Then Select India country. 
					      Then click on Analyze cta. 
					      Then Get fully loaded Time,location and title URL. 
					      Then After Analyze the share and download app see result for Mumbai, India. 
					      Then Share and download page location and loaded time for India country. 
					     
								
																										
#Most Most Downloaded link 		
 Scenario Outline: 
	Given Navigate to the website url. 
	Then Fills the Analyze Performance of app "<URL>". 
	Then click on Analyze cta. 
	Then Get fully loaded Time,location and title URL. 
	Then After Analyze the Most Downloaded app see result for Vancouver, Canada. 
	Then Most Downloaded page location and loaded time for Canada country. 
			
	      @loadatestonSanAnotonio(USA) 
	      Scenario Outline: 
		   Given Navigate to the website url. 
		   Then Fills the Analyze Performance of app "<URL>". 
		   Then Select the USA country. 
		   Then click on Analyze cta. 
		   Then Get fully loaded Time,location and title URL. 
		   Then After Analyze the Most Downloaded app see result for San Anotonio, USA. 
		   Then Most Downloaded page location and loaded time for USA country. 
		     
			        @loadatestonLondon(UK) 
			        Scenario Outline: 
				      Given Navigate to the website url. 
				      Then Fills the Analyze Performance of app "<URL>". 
				      Then Select London country. 
				      Then click on Analyze cta. 
				      Then Get fully loaded Time,location and title URL. 
				      Then After Analyze the Most Downloaded app see result for London, UK. 
				      Then Most Downloaded page location and loaded time for UK country. 
				      
			      @loadatestonMumbai(India) 
                               Scenario Outline: 
	                        Given Navigate to the website url. 
	                        Then Fills the Analyze Performance of app "<URL>". 
	                        Then Select India country. 
	                        Then click on Analyze cta. 
	                        Then Get fully loaded Time,location and title URL. 
	                        Then After Analyze the Most Downloaded app see result for Mumbai, India. 
	                        Then Most Downloaded page location and loaded time for India country. 
	                         
													
#Newly Added link 		
Scenario Outline: 
 Given Navigate to the website url. 
 Then Fills the Analyze Performance of app "<URL>". 
 Then click on Analyze cta. 
 Then Get fully loaded Time,location and title URL. 
 Then After Analyze the Newly Added app see result for Vancouver, Canada. 
 Then Newly Added page location and loaded time for Canada country. 
			
				@loadatestonSanAnotonio(USA) 
					Scenario Outline: 
						Given Navigate to the website url. 
						Then Fills the Analyze Performance of app "<URL>". 
						Then Select the USA country. 
						Then click on Analyze cta. 
						Then Get fully loaded Time,location and title URL. 
						Then After Analyze the Newly Added app see result for San Anotonio, USA. 
						Then Newly Added page location and loaded time for USA country. 
					
						
							@loadatestonLondon(UK) 
							Scenario Outline: 
								Given Navigate to the website url. 
								Then Fills the Analyze Performance of app "<URL>". 
								Then Select London country. 
								Then click on Analyze cta. 
								Then Get fully loaded Time,location and title URL. 
								Then After Analyze the Newly Added app see result for London, UK. 
							    Then Newly Added page location and loaded time for UK country. 
								
								       @loadatestonMumbai(India) 
								         Scenario Outline: 
									      Given Navigate to the website url. 
									      Then Fills the Analyze Performance of app "<URL>". 
									      Then Select India country. 
									      Then click on Analyze cta. 
									      Then Get fully loaded Time,location and title URL. 
									      Then After Analyze the Newly Added app see result for Mumbai, India. 
								          Then Newly Added page location and loaded time for India country. 
									        
									
												
#template finder 				
Scenario Outline: 
	Given Navigate to the website url. 
	Then Fills the Analyze Performance of app "<URL>". 
	Then click on Analyze cta. 
	Then Get fully loaded Time,location and title URL. 
	Then After Analyze the template finder app see result for Vancouver, Canada. 
	Then Template Finder page location and loaded time for Canada country. 
		
	       @loadatestonSanAnotonio(USA) 
	        Scenario Outline: 
		     Given Navigate to the website url. 
		     Then Fills the Analyze Performance of app "<URL>". 
		     Then Select the USA country. 
		     Then click on Analyze cta. 
		     Then Get fully loaded Time,location and title URL. 
		     Then After Analyze the template finder app see result for San Anotonio, USA. 
             Then Template Finder page location and loaded time for USA country. 
		   
		
		           @loadatestonMumbai(India) 
		             Scenario Outline: 
			           Given Navigate to the website url. 
			           Then Fills the Analyze Performance of app "<URL>". 
			           Then Select India country. 
			           Then click on Analyze cta. 
			           Then Get fully loaded Time,location and title URL. 
			           Then After Analyze the template finder app see result for Mumbai, India. 
			           Then Template Finder page location and loaded time for India country. 
			        
						
#listing page				
	Scenario Outline: 
	Given Navigate to the website url. 
	Then Fills the Analyze Performance of app "<URL>". 
	Then click on Analyze cta. 
	Then Get fully loaded Time,location and title URL. 
	Then After Analyze the listing page app see result for Vancouver, Canada. 
	Then Listing page location and loaded time for Canada country. 
	
	        @loadatestonSanAnotonio(USA) 
	         Scenario Outline: 
		       Given Navigate to the website url. 
		       Then Fills the Analyze Performance of app "<URL>". 
		       Then Select the USA country. 
		       Then click on Analyze cta. 
		       Then Get fully loaded Time,location and title URL. 
		       Then After Analyze the listing page app see result for San Anotonio, USA. 
		       Then Listing page location and loaded time for USA country. 
		      

			         @loadatestonLondon(UK) 
			         Scenario Outline: 
				         Given Navigate to the website url. 
				         Then Fills the Analyze Performance of app "<URL>". 
				         Then Select London country. 
				         Then click on Analyze cta. 
				         Then Get fully loaded Time,location and title URL. 
				         Then After Analyze the listing page app see result for London, UK. 
				         Then Listing page location and loaded time for UK country. 
	                    
	                            @loadatestonMumbai(India) 
	                              Scenario Outline: 
		                              Given Navigate to the website url. 
		                              Then Fills the Analyze Performance of app "<URL>". 
		                              Then Select India country. 
		                              Then click on Analyze cta. 
		                              Then Get fully loaded Time,location and title URL. 
		                              Then After Analyze the listing page app see result for Mumbai, India. 
		                              Then Listing page location and loaded time for India country. 
		                                
			
#product page
Scenario Outline: 
	Given Navigate to the website url. 
	Then Fills the Analyze Performance of app "<URL>". 
	Then click on Analyze cta. 
	Then Get fully loaded Time,location and title URL. 
	Then After Analyze the product page app see result for Vancouver, Canada. 
	Then Product page location and loaded time for Canada country. 
			
	         @loadatestonSanAnotonio(USA) 
	           Scenario Outline: 
		          Given Navigate to the website url. 
		          Then Fills the Analyze Performance of app "<URL>". 
		          Then Select the USA country. 
		          Then click on Analyze cta. 
		          Then Get fully loaded Time,location and title URL. 
		          Then After Analyze the product page app see result for San Anotonio, USA. 
		          Then Product page location and loaded time for USA country. 
		           
                        @loadatestonLondon(UK) 
                           Scenario Outline: 
	                     Given Navigate to the website url. 
	                     Then Fills the Analyze Performance of app "<URL>". 
	                     Then Select London country. 
	                     Then click on Analyze cta. 
	                     Then Get fully loaded Time,location and title URL. 
	                     Then After Analyze the product page app see result for London, UK.
	                     Then Product page location and loaded time for UK country.  
	                         
	                        @loadatestonMumbai(India) 
				  Scenario Outline:																																																					Scenario Outline: 
	                             Given Navigate to the website url. 
	                             Then Fills the Analyze Performance of app "<URL>". 
	                             Then Select India country. 
	                             Then click on Analyze cta. 
	                             Then Get fully loaded Time,location and title URL. 
	                             Then After Analyze the product page app see result for Mumbai, India. 
	                             Then Product page location and loaded time for India country. 
	                             
