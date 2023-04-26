
## Screenshots

![App Screenshot](https://github.com/NabeelKhanNK/Progress-Dialog-Library/blob/master/app/src/main/res/drawable/progress_dialog_ss.png)


# Progress-Dialog-Library
Progress Dialog Library will help you show customize dialog.




# Setup
Update your settings.gradle file with the following dependency.

```bash

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Update your module level build.gradle file with the following dependency.

```bash
  dependencies {
	        implementation 'com.github.NabeelKhanNK:Progress-Dialog-Library:1.1'
	}
```

# How to use

```bash
val progressBar: ProgressBar = ProgressBar()

// to show progress dialog
progressBar.showDialog(context = this)

// to hide progress dialog
progressBar.hideDialog()

```

# Find this library useful? ❤️

Star it and Follow me for more content like this


