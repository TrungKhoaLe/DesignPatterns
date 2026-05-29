| Problem (Substandard)           	| Fix with Factory Method                                                  	|
|---------------------------------	|--------------------------------------------------------------------------	|
| Tight coupling                  	| Client depends only on `NotificationFactory` - never on concrete classes 	|
| Violates open/closed principles 	| Add `SlackNotificationFactory` - zero changes to the existing code       	|
| Hard to test                    	| Swap any factory with a mock factory for unit testing                    	|
| Scattered creation logic        	| Each factory centralizes the creation of each own type                   	|
| No polymorphism                 	| All notifications share the `Notification` interface - fully polymorphic 	|
