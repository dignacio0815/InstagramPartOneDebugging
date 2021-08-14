# Instagram Part 1 Debugging Challenge

Don't be afraid to review projects you have made if you are struggling.

## Debugging strategies

### Basic debugging workflow
* Understand how to reproduce the issue
  * Retrace steps, focus on the input or sequence of inputs that caused the issue (toasts)
* Figure out the most likely reasons the problem occurred
  * Think about the tasks that would be happening as the app crashes and which ones you suspect might be causing this kind of crash
* Review each suspect and narrow down until you have a culprit
  * Use logcat/toasts/debugger to track down the exact cause of the issue
* Brainstorm potential solutions
  * Think about what you can change to fix this issue
* Resolve the issue
  * Implement the changes and test the app

### 3 Main ways to debug
* **Toasts : small in app notifications**
* **Logging with logcat : sending data to the log ( viewable from logcat)**
* **Debugger witgh Breakpoints : Set a breakpoint so you can pause app execution and look at variable states at specific points**


### **Toasts : best as a preventative**
#### Good
* Very fast to set up
* Easy to see while using app normally
#### Bad
* Can not stack, some may not show if multiple try to play at the same time
* They can not be copied from and do not persist
#### Best times to use
* Checking if things that fail gracefully (no crash/error ) are working during normal use
* Examples Listeners, and Asynchronous callbacks


### **Logging : with Logcat**
#### Good
* Easy to check multiple things at the same time
* Can be reviewed after crash
* Most crashes will show up in logcat with a Line #
* Can filter based on options
#### Bad
* It can be hard to use while using the app, so you may be forced to review after crash or after run.
#### Best times to use
* First place to check if you get an unexpected crash
* If you are unsure if an API call is working you can print the response URL and check in browser.
* If you are looking for the cause of a crash that is coming form a code you have not written (example glide or room)


### **Breakpoints : with the Debugger**
#### Good
* Gives you the absolute most information about the state of variables.
* Requires no extra lines of code
* Allows for line by line code execution

#### Bad
* Line by line code exploration can take a lot of time
* Can make Async functions (API calls) break

#### Best times to use
* When you know the issue is related to a variable assigned an unexpected value (null, or junk), but you are unsure where
* When you are unable to find the cause via Logging



# Hints
* Are we using the correct permissions?
* Are our views set up properly?
* When launching an intent, is it going to MainActivity?
* What parameters are we passing when trying to login?
* Using the correct authority for when creating the URI?
* Are we launching the activity after we get the image?

