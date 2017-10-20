package com.opg.sdk;
///////////////////////////////////////////////////////////////////////////////
//
//Copyright (c) 2016 OnePoint Global Ltd. All rights reserved.
//
//This code is licensed under the OnePoint Global License.
//
//THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
//THE SOFTWARE.
//
///////////////////////////////////////////////////////////////////////////////

import com.allatori.annotations.DoNotRename;

/**
 * 
 * OPGSurveyInterface
 */
@DoNotRename
public interface OPGSurveyInterface {

	/**
	 * This method indicates that the survey has been completed.
	 */
	@DoNotRename
	public void didSurveyCompleted();

	/**
	 * Sent after a web view finishes loading a frame.
	 */
	@DoNotRename
	public void didSurveyFinishLoad();

	/**
	 * The web view that has begun loading a new frame.
	 */
	@DoNotRename
	public void didSurveyStartLoad();

}